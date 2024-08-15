package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface WorktopOptionNotify {
    var gadgetEntityId: Int
    @RemovedIn(Version.GI_CB2)
    var optionId: Int
    @AddedIn(Version.GI_CB2)
    @AltName("optionList")
    var optionIdList: List<Int>
}

