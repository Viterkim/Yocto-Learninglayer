do_deploy_append_raspberrypi3-64() {
    echo "enable_uart=1" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dtparam=spi=on" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dtoverlay=mcp2515-can0,oscillator=16000000,interrupt=25" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dtoverlay=spi-bcm2835-overlay" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dtparam=i2c_arm=on" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}
