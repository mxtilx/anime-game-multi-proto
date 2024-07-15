package data.quest.bargain

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(RESPONSE)
internal interface BargainOfferPriceRsp {
    var bargainResult: BargainResultType
    var curMood: Int
    var resultParam: Int
    var retCode: Int
}
