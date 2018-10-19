SUMMARY = "Init and script changes"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PV = "1.0"
SRC_URI = "file://da.kmap \
file://getgps.sh \
file://getcan.sh \
file://S06start"

inherit allarch
do_install(){
  install -d ${D}/etc/rcS.d
  install -d ${D}/root

  install -m 0755 ${WORKDIR}/S06start ${D}/etc/rcS.d/
  install -m 0755 ${WORKDIR}/da.kmap ${D}/etc/
  install -m 0755 ${WORKDIR}/getgps.sh ${D}/root/
  install -m 0755 ${WORKDIR}/getcan.sh ${D}/root/
}
FILES_${PN} += "/etc /root"
