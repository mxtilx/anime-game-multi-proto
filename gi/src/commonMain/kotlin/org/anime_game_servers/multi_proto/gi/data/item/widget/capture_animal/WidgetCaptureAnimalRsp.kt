package org.anime_game_servers.multi_proto.gi.data.item.widget.capture_animal

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_2_3_0)
@ProtoCommand(RESPONSE)
internal interface WidgetCaptureAnimalRsp {
    var retcode: Retcode
    var entityId: Int
    var materialId: Int
    var pos: Vector
}
