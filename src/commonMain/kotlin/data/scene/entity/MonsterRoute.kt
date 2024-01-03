package data.scene.entity

import annotations.AddedIn
import data.general.RoutePoint
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_3_0)
@ProtoModel
internal interface MonsterRoute {
    var routePoints: List<RoutePoint>
    var speedLevel: Int
    var routeType: Int
    var arriveRange: Float
}
