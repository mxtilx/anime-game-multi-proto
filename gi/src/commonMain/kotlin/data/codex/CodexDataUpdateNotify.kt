package data.codex

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_0_0)
@ProtoCommand(NOTIFY, alternateNames = ["CodexDataUpdataNotify"])
internal interface CodexDataUpdateNotify {
    var id: Int
    var type: CodexType
    var weaponMaxPromoteLevel: Int
}
