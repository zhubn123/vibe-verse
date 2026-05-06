# vibe-verse

`vibe-verse` 是本地根工作区，用来把后端和前端两个独立仓库放在一起。

根仓库只保留少量说明文件，不管理业务代码。

仓库地址：

- 根工作区：https://github.com/zhubn123/vibe-verse
- 后端：https://github.com/zhubn123/vibe-verse-server
- 前端：https://github.com/zhubn123/vibe-verse-web

```text
vibe-verse/
├─ AGENTS.md
├─ CODEX.md
├─ LOCAL.example.md
├─ README.md
├─ vibe-verse-server/   # 独立后端仓库，根仓库忽略
└─ vibe-verse-web/      # 独立 React 前端仓库，根仓库忽略
```

## 目录说明

- `vibe-verse-server`：Spring Boot 后端仓库。
- `vibe-verse-web`：React + TypeScript 前端仓库。
- `LOCAL.md`：个人本地记录，不提交。

## 本地约定

1. 个人本地配置写入 `LOCAL.md`，不要提交。
2. 后端、前端仓库各自维护自己的提交历史。
3. 根仓库 `.gitignore` 会忽略 `vibe-verse-server/` 和 `vibe-verse-web/`。
