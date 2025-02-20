package org.anime_game_servers.multi_proto.gi.data.ability.meta

import org.anime_game_servers.multi_proto.gi.data.ability.ModifierAction
import org.anime_game_servers.multi_proto.gi.data.ability.ModifierProperty
import org.anime_game_servers.multi_proto.gi.data.general.ability.AbilityAttachedModifier
import org.anime_game_servers.multi_proto.gi.data.general.ability.AbilityString
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface AbilityMetaModifierChange {
    var action: ModifierAction
    var applyEntityId: Int
    var attachedInstancedModifier: AbilityAttachedModifier
    var isMuteRemote: Boolean
    var modifierLocalId: Int
    var parentAbilityName: AbilityString
    var parentAbilityOverride: AbilityString
    var properties: List<ModifierProperty>
    @AddedIn(GI_CB2)
    var isAttachedParentAbility: Boolean
    @AddedIn(GI_0_9_0)
    var serverBuffUid: Int
    @AddedIn(GI_2_3_0)
    var isDurabilityZero: Boolean
}
