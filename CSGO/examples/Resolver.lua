local function on_resolver(resolver_info)
  local player = entitylist.get_player_by_index(resolver_info.target_index)
  resolver_info.current_animation = player:get_eye_position().y + player:get_max_desync_delta()
end
// this just joker, don't trust this lmao
cheat.register_callback("on_resolver", on_resolver)
