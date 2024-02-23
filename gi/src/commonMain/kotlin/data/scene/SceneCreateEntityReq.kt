package data.scene

import data.general.entity.CreateEntityInfo
import data.scene.entity.CreateReason
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.REQUEST)
internal interface SceneCreateEntityReq {
    var entity: CreateEntityInfo
    var reason: CreateReason
    @AddedIn(Version.GI_CB2)
    var isDestroyWhenDisconnect: Boolean
}