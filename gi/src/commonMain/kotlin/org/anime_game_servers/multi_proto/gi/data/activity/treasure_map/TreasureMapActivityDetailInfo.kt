package org.anime_game_servers.multi_proto.gi.data.activity.treasure_map

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_2_0)
@ProtoModel
internal interface TreasureMapActivityDetailInfo {
    var activeRegionIndex: Int
    var bonusChallengeList: List<TreasureMapBonusChallengeInfo>
    var currencyNum: Int
    var isMpChallengeTouched: Boolean
    var minOpenPlayerLevel: Int
    var previewRewardId: Int
    var regionInfoList: List<TreasureMapRegionInfo>
    var treasureCloseTime: Int
    @AddedIn(GI_2_0_0)
    var totalMpSpotNum: Int
}
