## `Pre_Prediction`
PrePrediction callback

    cheat.register_callback("on_preprediction", function(user_cmd)
        
    end)
    
 ## `Prediction`
Prediction callback

    cheat.register_callback("on_prediction", function(user_cmd)
        
    end)
    
 ## `Restore Prediction`
Prediction callback

    cheat.register_callback("on_restoreprediction", function(user_cmd)
        
    end)
    
## `Create Move`
CreateMove callback

    cheat.register_callback("on_createmove", function(user_cmd)
        
    end)
    
## `Frame Stage`
FrameStage callback

    cheat.register_callback("on_framestage", function(stage)
        
    end)

## `Paint Traverse`
Paint callback (Will be removed later)

    cheat.register_callback("on_paint", function()
        
    end)
    
## `OBS-Bypass Draw`
Draw callback (image)

    cheat.register_callback("on_draw", function()
        
    end)

## `Shot Success`
Shot callback

    cheat.register_callback("on_shot", function(shot_info)
        
    end)

## `Resolver`
Resolver callback

    cheat.register_callback("on_resolver", function(resolver_info)
        
    end)

## `Event`
CS:GO Event callback

    events.register_event("player_hurt", function(event)
        
    end)
