SUMMARY = "sl train"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PV = "1.0"
SRCREV="923e7d7ebc5c1f009755bdeb789ac25658ccce03"
SRC_URI = "git://github.com/mtoyoda/sl.git"
S = "${WORKDIR}/git"
B = "${S}"
DEPENDS += "ncurses"

TARGET_CC_ARCH += "${LDFLAGS}"
EXTRA_OEMAKE = "'CC=${CC}' 'CFLAGS=${CFLAGS}'"

do_install(){
  install -d ${D}/root/
  install -m 0755 ${B}/sl ${D}/root/sl
}
FILES_${PN} += "/root"
