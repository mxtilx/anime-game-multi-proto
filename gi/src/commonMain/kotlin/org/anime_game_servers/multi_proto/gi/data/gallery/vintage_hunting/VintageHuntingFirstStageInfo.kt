package org.anime_game_servers.multi_proto.gi.data.gallery.vintage_hunting

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_1_0)
@ProtoModel
internal interface VintageHuntingFirstStageInfo {
    @AltName("brutal_cnt", "brutalCnt")
    var brutalCount: Int
    @AltName("elite_cnt", "eliteCnt")
    var eliteCount: Int
    var score: Int
    @AltName("timid_cnt", "timidCnt")
    var timidCount: Int
}