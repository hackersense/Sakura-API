var scriptName = "Test";
var scriptVersion = 1.0;
var scriptDev = "Test";
var scriptType = "Module";
var moduleName = "Test";
var moduleType = "Misc";

var testBoolean = value.createBooleanValue("TEST", true);

this.onToggle = function (enabled) {
    if (enabled)
    {
      mc.player.jump()
    }
}
