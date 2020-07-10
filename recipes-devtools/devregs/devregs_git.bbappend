SRCREV = "b2c5fccd8137deed2393f5b4ebdea8d5e644016f"

inherit autotools-brokensep

do_install_append() {
        cp -fv ${S}/dat/devregs_imx6* ${D}${sysconfdir}/
}

FILES_${PN} += " \
        ${sysconfdir}/devregs_imx6*.dat \
"

