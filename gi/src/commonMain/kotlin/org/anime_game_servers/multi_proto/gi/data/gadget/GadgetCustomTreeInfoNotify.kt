package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.CustomGadgetTreeInfo
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_2_0)
@ProtoCommand(NOTIFY)
internal interface GadgetCustomTreeInfoNotify {
    var customGadgetTreeInfo: CustomGadgetTreeInfo
    var gadgetEntityId: Int
}