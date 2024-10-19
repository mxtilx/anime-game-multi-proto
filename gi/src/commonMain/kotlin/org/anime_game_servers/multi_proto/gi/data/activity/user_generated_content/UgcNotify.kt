package org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_7_0)
@ProtoCommand(NOTIFY)
internal interface UgcNotify {
    var isUgcPublishBan: Boolean
    var isUgcPublishFeatureClosed: Boolean
    var isUgcFeatureClosed: Boolean
}