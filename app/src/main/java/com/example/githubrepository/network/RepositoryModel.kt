package com.example.githubrepository.network

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

data class RepositoryModel (
    val id: Long,

    @Json(name = "node_id")
    val nodeID: String?,

    val name: String?,

    @Json(name = "full_name")
    val fullName: String?,

    val private: Boolean?,
    val owner: Owner?,

    @Json(name = "html_url")
    val htmlURL: String?,

    val description: String?,
    val fork: Boolean?,
    val url: String?,

    @Json(name = "forks_url")
    val forksURL: String?,

    @Json(name = "keys_url")
    val keysURL: String?,

    @Json(name = "collaborators_url")
    val collaboratorsURL: String?,

    @Json(name = "teams_url")
    val teamsURL: String?,

    @Json(name = "hooks_url")
    val hooksURL: String?,

    @Json(name = "issue_events_url")
    val issueEventsURL: String?,

    @Json(name = "events_url")
    val eventsURL: String?,

    @Json(name = "assignees_url")
    val assigneesURL: String?,

    @Json(name = "branches_url")
    val branchesURL: String?,

    @Json(name = "tags_url")
    val tagsURL: String?,

    @Json(name = "blobs_url")
    val blobsURL: String?,

    @Json(name = "git_tags_url")
    val gitTagsURL: String?,

    @Json(name = "git_refs_url")
    val gitRefsURL: String?,

    @Json(name = "trees_url")
    val treesURL: String?,

    @Json(name = "statuses_url")
    val statusesURL: String?,

    @Json(name = "languages_url")
    val languagesURL: String?,

    @Json(name = "stargazers_url")
    val stargazersURL: String?,

    @Json(name = "contributors_url")
    val contributorsURL: String?,

    @Json(name = "subscribers_url")
    val subscribersURL: String?,

    @Json(name = "subscription_url")
    val subscriptionURL: String?,

    @Json(name = "commits_url")
    val commitsURL: String?,

    @Json(name = "git_commits_url")
    val gitCommitsURL: String?,

    @Json(name = "comments_url")
    val commentsURL: String?,

    @Json(name = "issue_comment_url")
    val issueCommentURL: String?,

    @Json(name = "contents_url")
    val contentsURL: String?,

    @Json(name = "compare_url")
    val compareURL: String?,

    @Json(name = "merges_url")
    val mergesURL: String?,

    @Json(name = "archive_url")
    val archiveURL: String?,

    @Json(name = "downloads_url")
    val downloadsURL: String?,

    @Json(name = "issues_url")
    val issuesURL: String?,

    @Json(name = "pulls_url")
    val pullsURL: String?,

    @Json(name = "milestones_url")
    val milestonesURL: String?,

    @Json(name = "notifications_url")
    val notificationsURL: String?,

    @Json(name = "labels_url")
    val labelsURL: String?,

    @Json(name = "releases_url")
    val releasesURL: String?,

    @Json(name = "deployments_url")
    val deploymentsURL: String?,

    @Json(name = "created_at")
    val createdAt: String?,

    @Json(name = "updated_at")
    val updatedAt: String?,

    @Json(name = "pushed_at")
    val pushedAt: String?,

    @Json(name = "git_url")
    val gitURL: String?,

    @Json(name = "ssh_url")
    val sshURL: String?,

    @Json(name = "clone_url")
    val cloneURL: String?,

    @Json(name = "svn_url")
    val svnURL: String?,

    val homepage: String?,
    val size: Long?,

    @Json(name = "stargazers_count")
    val stargazersCount: Long?,

    @Json(name = "watchers_count")
    val watchersCount: Long?,

    val language: String?,

    @Json(name = "has_issues")
    val hasIssues: Boolean?,

    @Json(name = "has_projects")
    val hasProjects: Boolean?,

    @Json(name = "has_downloads")
    val hasDownloads: Boolean?,

    @Json(name = "has_wiki")
    val hasWiki: Boolean?,

    @Json(name = "has_pages")
    val hasPages: Boolean?,

    @Json(name = "forks_count")
    val forksCount: Long?,

    @Json(name = "mirror_url")
    val mirrorURL: Any? ,

    val archived: Boolean?,
    val disabled: Boolean?,

    @Json(name = "open_issues_count")
    val openIssuesCount: Long?,

    val license: Licence?,
    val forks: Long?,

    @Json(name = "open_issues")
    val openIssues: Long?,

    val watchers: Long?,

    @Json(name = "default_branch")
    val defaultBranch: String?
)


