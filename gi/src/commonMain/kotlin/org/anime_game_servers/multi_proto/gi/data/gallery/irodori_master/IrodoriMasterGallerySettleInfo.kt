package org.anime_game_servers.multi_proto.gi.data.gallery.irodori_master

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.gallery.GalleryStopReason

@AddedIn(GI_2_6_0)
@ProtoModel
internal interface IrodoriMasterGallerySettleInfo {
    var difficult: Int
    var finishTime: Int
    var isFinish: Boolean
    var levelId: Int
    var reason: GalleryStopReason
}
