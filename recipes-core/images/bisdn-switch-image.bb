# Copyright (C) 2018 Tobias Jungel <tobias.jungel@bisdn.de> and Henrike Wissing <henrike.wissing@bisdn.de>
# Released under the MIT license (see COPYING.MIT for the terms)

require bisdn-minimal-image.bb

IMAGE_FEATURES += " package-management"

BISDN_SWITCH_IMAGE_EXTRA_INSTALL += "\
    baseboxd \
    baseboxd-tools \
    file \
    frr \
    ipcalc \
    iproute2-ss \
    iptables \
    jq \
    kernel-module-linux-kernel-bde \
    kernel-module-linux-user-bde \
    less \
    lmsensors-fancontrol \
    lmsensors-pwmconfig \
    lmsensors-sensors \
    lmsensors-sensorsconfconvert \
    lmsensors-sensorsdetect \
    man-pages \
    ofagent \
    ofdpa \
    ofdpa-grpc \
    polkit \
    procps \
    python \
    python-modules \
    python-msgpack \
    python-redis \
    python-requests \
    python-ryu \
    python2-ofdpa \
    radvd \
    tcpdump \
    "

IMAGE_LINGUAS = " "

LICENSE = "MIT"
