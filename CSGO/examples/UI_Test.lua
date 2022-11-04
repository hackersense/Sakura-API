local checkbox = ui.add_check_box("Checkbox", true)

local function on_paint()
    console.execute("echo \"" .. (ui.get_bool(checkbox) and "true" or "false") .. "\"")
end

cheat.register_callback("on_paint", on_paint)
