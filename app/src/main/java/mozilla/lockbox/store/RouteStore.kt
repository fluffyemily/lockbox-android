/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package mozilla.lockbox.store
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.subjects.BehaviorSubject
import mozilla.lockbox.action.RouteAction
import mozilla.lockbox.extensions.filterByType
import mozilla.lockbox.flux.Dispatcher

class RouteStore(dispatcher: Dispatcher = Dispatcher.shared) {
    companion object {
        val shared = RouteStore()
    }

    val routes: Observable<RouteAction>

    val compositeDisposable = CompositeDisposable()

    init {
        val subject = BehaviorSubject.createDefault<RouteAction>(RouteAction.Welcome)
        routes = subject

        dispatcher.register
                .filterByType(RouteAction::class.java)
                .subscribe(subject::onNext)
                .addTo(compositeDisposable)
    }
}