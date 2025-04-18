package org.anime_game_servers.multi_proto.gi.data.battle.event

import org.anime_game_servers.multi_proto.gi.data.scene.entity.EntityRendererChangedInfo
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(CLIENT)
internal interface EvtEntityRenderersChangedNotify {
    var entityId: Int
    var forwardType: org.anime_game_servers.multi_proto.gi.data.battle.ForwardType
    var isServerCache: Boolean
    var rendererChangedInfo: EntityRendererChangedInfo
}
