do_deploy_append_raspberrypi3-64() {
    echo "enable_uart=1" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}
