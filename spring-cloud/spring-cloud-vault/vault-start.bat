echo Starting vault server...
pushd %~dp0%
vault server -config %~dp0%/src/test/vault-config/vault-test.hcl
