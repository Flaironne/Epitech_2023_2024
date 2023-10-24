#!/bin/bash

if [ $# -eq 0 ]; then
  echo "Usage: $0 <commit_message>"
  exit 1
fi

git add *
git commit -m "$1"

if git push; then
    echo "le git a été push"
else
    echo "probleme pour git push"
fi
