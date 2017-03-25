#!/usr/bin/env groovy

def log(message) {
    echo("${message}")
}

def warning(message) {
    log("WARNING: ${message}")
}

return this
