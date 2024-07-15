package data.city_reputation

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_1_0)
@ProtoCommand(RESPONSE)
internal interface GetCityReputationInfoRsp {
    var cityId: Int
    var cityReputationInfo: CityReputationInfo
    var retCode: Int
}
