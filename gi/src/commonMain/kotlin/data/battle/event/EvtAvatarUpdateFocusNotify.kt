package data.battle.event

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(CLIENT)
internal interface EvtAvatarUpdateFocusNotify {
    var entityId: Int
    var focusForward: Vector
    var forwardType: data.battle.ForwardType
}
