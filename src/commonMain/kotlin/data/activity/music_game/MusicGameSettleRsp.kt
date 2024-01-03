package data.activity.music_game

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V2_2_0)
@ProtoCommand(CommandType.RESPONSE)
interface MusicGameSettleRsp {
    var musicBasicId: Int
    var isUnlockNextLevel: Boolean
    var isNewRecord: Boolean
    @AddedIn(VERSION.V2_7_0)
    var ugcGuid: Long
    var retcode: Int
}