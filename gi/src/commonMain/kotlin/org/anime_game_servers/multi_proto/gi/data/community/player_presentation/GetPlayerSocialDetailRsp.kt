package org.anime_game_servers.multi_proto.gi.data.community.player_presentation

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(Version.GI_0_9_0)
@ProtoCommand(CommandType.RESPONSE)
internal interface GetPlayerSocialDetailRsp {
    var retCode: Retcode
    var detailData: SocialDetail
}