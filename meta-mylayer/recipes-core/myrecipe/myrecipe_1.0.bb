SUMMARY = "Init and script changes"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PV = "1.0"
SRC_URI = "file://da.kmap \
file://S0start \
file://autologin \
file://new_wpa_supplicant.conf \
file://inittab"
inherit allarch
do_install(){
  install -d ${D}/etc/init.d
  install -d ${D}/etc/rcS.d
  install -d ${D}/root

  install -m 0755 ${WORKDIR}/S0start ${D}/etc/rcS.d/
  install -m 0755 ${WORKDIR}/autologin ${D}/etc/init.d/
  # rf -rf ${D}/etc/inittab
  # install -m 0755 ${WORKDIR}/inittab ${D}/etc/inittab
  install -m 0755 ${WORKDIR}/da.kmap ${D}/etc/
  install -m 0755 ${WORKDIR}/new_wpa_supplicant.conf ${D}/root/
}
FILES_${PN} += "/etc /root"
