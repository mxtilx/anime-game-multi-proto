package org.anime_game_servers.multi_proto.gi.data.login

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@RemovedIn(GI_1_0_0)
@ProtoModel
internal interface RegionCustomConfig {
    @AltName("antidebugPc")
    var antiDebugPc: Boolean
    @AltName("antidubugAndrod")
    var antiDebugAndroid: Boolean
    @AltName("antidubugIos")
    var antiDebugIos: Boolean
    @AltName("closeAntidebug")
    var closeAntiDebug: Boolean
    var forceKill: Boolean
}
