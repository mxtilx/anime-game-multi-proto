package data.npc

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.V3_1_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface FinishedTalkIdListNotify {
    var finishedTalkIdList: List<Int>
}
