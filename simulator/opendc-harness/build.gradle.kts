/*
 * Copyright (c) 2020 AtLarge Research
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

description = "Harness for defining repeatable experiments using OpenDC"

/* Build configuration */
plugins {
    `kotlin-library-conventions`
    `testing-conventions`
    `jacoco-conventions`
}

dependencies {
    api(platform(project(":opendc-platform")))
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core")
    api("org.junit.platform:junit-platform-commons:${versions.junitPlatform}")

    implementation("org.junit.platform:junit-platform-engine:${versions.junitPlatform}")
    implementation("io.github.classgraph:classgraph:${versions["classgraph"]}")
    implementation("io.github.microutils:kotlin-logging")

    implementation("com.github.ajalt.clikt:clikt:${versions["clikt"]}")
    implementation("me.tongfei:progressbar:${versions["progressbar"]}")

    runtimeOnly("org.apache.logging.log4j:log4j-slf4j-impl:${versions.log4j}")
}
