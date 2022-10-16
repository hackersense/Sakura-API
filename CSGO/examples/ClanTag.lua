local set_clantag_pattern = ffi.cast("int(__fastcall*)(const char*, const char*)", memory.find_pattern("engine.dll", "53 56 57 8B DA 8B F9 FF 15"))

local lasttime = 0

local chocolate = { "", "|", "|\\ ", "|\\|", "C ", "C3 ", "Ch ", "Ch\\ ", "Ch\\/ ", "Cho ", "Cho3 ", "Choc ", "Choc| ", "Choc|2 ", "Choco| ", "Chocol ", "Chocol4 ", "Chocola ", "Chocolat| ", "Chocolat|D ", "Chocolat ", "Chocolate ", "Chocolate. ", "Chocolate.< ", "Chocolate.m ", "Chocolate.m< ", "Chocolate.me ", "Chocolate.me ", "Chocolate.m< ", "Chocolate.m ", "Chocolate.< ", "Chocolate. ", "Chocolate ", "Chocola|D ", "Chocola| ", "Chocola_ ", "Chocol4 ", "Chocol ", "Choco_ ", "Choco| ", "Choco_ ", "Choc|2 ", "Choc| ", "Choc_ ", "Cho3 ", "Cho_ ", "Ch\\/ ", "Ch\\ ", "Ch_ ", "C3 ", "C_ ", "|\\|", "|\\ ", "|", "" }

function toInteger(number)
      return math.floor(tonumber(number) or error("Could not cast '" .. tostring(number) .."' to number.'"))
end

cheat.register_callback("on_paint", function()
      local time = toInteger(globals.get_curtime() * 3)
      if time ~= lasttime then
            set_clantag_pattern(chocolate[time % #chocolate], chocolate[time % #chocolate])
      end
      lasttime = time;
end)
