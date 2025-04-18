package org.anime_game_servers.multi_proto.gi.data.scene.camera

import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_3_1_0)
@ProtoCommand(NOTIFY)
internal interface BeginCameraSceneLookWithTemplateNotify {
    var entityId: Int
    var followPos: Vector
    var followType: FollowType
    var lookPos: Vector
    var otherParams: List<String>
    var templateId: Int
}
