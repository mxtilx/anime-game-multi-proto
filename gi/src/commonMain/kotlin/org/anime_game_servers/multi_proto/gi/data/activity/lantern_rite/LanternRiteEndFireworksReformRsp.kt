package org.anime_game_servers.multi_proto.gi.data.activity.lantern_rite

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_2_4_0)
@ProtoCommand(RESPONSE)
internal interface LanternRiteEndFireworksReformRsp {
    var retcode: Retcode
    var challengeId: Int
    var finalScore: Int
    var isFullScore: Boolean
    var isNewRecord: Boolean
    var isStaminaUp: Boolean
    var isUnlockFireworks: Boolean
    var isUnlockNewSkill: Boolean
    var stageId: Int
}
