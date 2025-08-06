# Differences with master repo?

> [!IMPORTANT]
> `vibrate.trigger()` invokes `EFFECT_CLICK` pattern instead of the `DEFAULT_AMPLITUDE`, which is the default one. I use this in my project, where I want to make clickable buttons impactful, so you can use it as well. **This is only android Q+ feature (SDK 29+)**, so make sure you develop the game with `minSdk=29` as well!
<img width="347" height="90" alt="image" src="https://github.com/user-attachments/assets/04cb556c-255f-4625-9a86-46ab8a7bbf34" />


# extension-vibrate

Adds support for device vibration service in Defold.

# Platform support

The currently supported platforms are: ~~iOS~~ **NOT IN MY FORK** and Android


# FAQ

## How do I use this extension?

Add the package link (https://github.com/supchyan/extension-vibrate/archive/refs/heads/master.zip)
to the project setting `project.dependencies`, and you should be good to go.

See the [manual](http://www.defold.com/manuals/libraries/) for further info.


# Usage

```lua
if vibrate then
  vibrate.trigger()
end
```
Invoke the device specific vibration service.

