package data.quest.variable

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface QuestUpdateQuestVarRsp {
    var questId: Int
    @AddedIn(GI_0_9_0)
    var parentQuestId: Int
    @AddedIn(GI_1_2_0)
    var parentQuestVarSeq: Int
    var retCode: Int
}
