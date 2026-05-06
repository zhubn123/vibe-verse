# AGENTS.md

## 基本说明

`vibe-verse` 根目录只是本地协作工作区，不是后端应用，也不是前端应用。

后端和前端分别放在两个独立仓库里：

- `vibe-verse-server`
- `vibe-verse-web`

## 当前项目结构

```text
vibe-verse/
├─ AGENTS.md
├─ CODEX.md
├─ LOCAL.example.md
├─ README.md
├─ vibe-verse-server/   # 独立后端仓库，根仓库忽略
└─ vibe-verse-web/      # 独立 React 前端仓库，根仓库忽略
```

## 使用规则

- 根仓库只保留少量说明文件和本地模板。
- `vibe-verse-server/`、`vibe-verse-web/` 由各自仓库管理，根仓库不要提交它们。
- 如果任务明确落到后端或前端，再进入对应子仓库处理。
- 具体协作方式由团队口头约定，不在这里写重流程。
