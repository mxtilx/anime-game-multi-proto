package org.anime_game_servers.multi_proto.gi.data.item.upgrade

import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_CB1)
@ProtoCommand(RESPONSE)
internal interface WeaponUpgradeRsp {
    var retCode: Retcode
    var curLevel: Int
    var oldLevel: Int
    var targetWeaponGuid: Long
    @AddedIn(GI_1_1_0)
    var itemParamList: List<ItemParam>
}
