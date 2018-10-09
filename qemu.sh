# Won't run, gets stuck in the end
qemu-system-aarch64 \
-machine virt \
-cpu cortex-a57 \
-m 512 \
-nographic -smp 1 \
-drive format=raw,file=build/tmp-glibc/deploy/images/raspberrypi3-64/myimage-raspberrypi3-64.ext4  \
-kernel kernelforqemu \
-append "rw rootfstype=ext4 console=ttyAMA0 root=/dev/vda oops=panic panic_on_warn=1 panic=-1 ftrace_dump_on_oops=orig_cpu debug earlyprintk=serial slub_debug=UZ" \
-net user,hostfwd=tcp::10023-:22 -net nic
