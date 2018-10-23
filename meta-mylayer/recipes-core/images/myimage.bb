inherit core-image

DESCRIPTION = "Stock minimal image + xdelta, vim and tree"
LICENSE = "MIT"

IMAGE_FSTYPES += "tar wic.bmap wic.gz ext4"
WKS_FILE = "${MACHINE}.wks.in"

IMAGE_INSTALL += " \
	xdelta3 \
	vim \
	tree \
  nodejs \
  myrecipe \
  sl \
  canutils \
  gpsd \
  "

# read-only-rootfs debug-tweaks
IMAGE_FEATURES_append = " allow-empty-password"

# Create folders on the image, before image files are generated
IMAGE_FOLDERS = " \
  /secondrootfs \
  /data \
"

IMAGE_PREPROCESS_COMMAND_append = "do_image_app;"
do_image_app() {
    for f in ${IMAGE_FOLDERS}; do
        install -d ${IMAGE_ROOTFS}$f
    done
}
