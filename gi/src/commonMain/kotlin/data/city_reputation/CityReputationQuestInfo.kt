package data.city_reputation

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_1_0)
@ProtoModel
internal interface CityReputationQuestInfo {
    var finishedParentQuestList: List<Int>
    var isOpen: Boolean
    var takenParentQuestRewardList: List<Int>
}
