This Yocto layer contains some private, local stuff I use in my Wandboard images:
* adds recipes for devregs and imx-usb-loader
* configures the Ethernet port for 192.168.1.200
* adds a recipe for kernel 4.14.x with device tree for revision D1

## Dependencies

It is mainly used with these layers
```
URI: git://git.yoctoproject.org/poky.git
branch: dunfell

URI: git://git.openembedded.org/meta-openembedded
branch: dunfell

URI: git://git.yoctoproject.org/meta-security.git
branch: dunfell

URI: https://github.com/jumpnow/meta-jumpnow.git
branch: dunfell

URI: https://github.com/jumpnow/meta-wandboard
branch: dunfell
```

## Setup
See https://jumpnowtek.com/wandboard/Wandboard-Systems-with-Yocto.html for a detailed description on how to setup the Yocto build environment.
