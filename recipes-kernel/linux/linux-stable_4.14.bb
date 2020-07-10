LIC_FILES_CHKSUM ?= "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

require linux-stable.inc

LINUX_VERSION = "4.14"
LINUX_VERSION_EXTENSION = "-iav"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-stable-${LINUX_VERSION}:"

S = "${WORKDIR}/git"

PV = "4.14.113"
SRCREV = "4631eac4d3b2e4c202f18e947106e3a20f668145"
SRC_URI = " \
    git:///opt/yocto/kernel.iav;protocol=file;branch=4.14.y/develop \
    file://defconfig \
    file://0001-added-dts-files-for-Wandboard-rev-D1.patch \
"
