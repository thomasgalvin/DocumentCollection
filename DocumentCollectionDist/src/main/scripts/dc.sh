#! /bin/sh

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
java -jar $DIR/docs.jar "$@"