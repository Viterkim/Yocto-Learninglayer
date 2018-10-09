sudo rm -rf extractedrootfs
sudo mkdir -p extractedrootfs/mounted 
sudo mount build/tmp-glibc/deploy/images/raspberrypi3-64/myimage-raspberrypi3-64.ext4 extractedrootfs/mounted
sudo cp -r extractedrootfs/mounted/* extractedrootfs/
sudo umount extractedrootfs/mounted
sudo rm -rf extractedrootfs/mounted
