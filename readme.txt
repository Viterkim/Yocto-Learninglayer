Clone recursively
git clone --recursive git@github.com:Viterkim/Yocto-Learninglayer.git
git submodule update --remote


Dependant on these layers:
poky
meta-openembedded(meta-oe)
meta-raspberrypi

Run setup.sh to set python2 up properly

Set these after generation of build/local.conf
BB_NUMBER_THREADS = "2"
PARALLEL_MAKE = "-j4"
RM_OLD_IMAGE = "1"
