package data.item

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface ItemHint {
    var count: Int
    var isNew: Boolean
    var itemId: Int
    @AddedIn(GI_2_3_0)
    var guid: Long
}
