package com.zhousl.aether.platform

import platform.UIKit.UIImpactFeedbackGenerator
import platform.UIKit.UIImpactFeedbackStyleLight

private val hapticGenerator = UIImpactFeedbackGenerator(style = UIImpactFeedbackStyleLight)

actual fun platformHapticFeedback() {
    hapticGenerator.impactOccurred()
}
